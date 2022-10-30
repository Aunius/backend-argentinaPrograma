package com.portfolio.portfolioargprog.util;

import com.portfolio.portfolioargprog.security.entity.Rol;
import com.portfolio.portfolioargprog.security.enums.RolNombre;
import com.portfolio.portfolioargprog.security.service.RolService;
import com.portfolio.portfolioargprog.entity.Informacion;
import com.portfolio.portfolioargprog.service.InformacionService;
import com.portfolio.portfolioargprog.security.entity.Usuario;
import com.portfolio.portfolioargprog.security.service.UsuarioService;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import org.springframework.security.crypto.password.PasswordEncoder;


/*
MUY IMPORTANTE: ESTA CLASE SÓLO SE EJECUTARÁ UNA VEZ PARA CREAR LOS REGISTROS EN INFORMACIÓN Y UN USUARIO Y UN ROL.
*/

@Component
public class Inicializar implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Autowired
    InformacionService servicio;

    @Autowired
    UsuarioService servicioUsuario;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {

        if(!rolService.existsByRolNombre(RolNombre.ROLE_ADMIN)){
            Rol rol = new Rol(RolNombre.ROLE_ADMIN);
            rolService.save(rol);
        }

        if(!servicio.existsBySlug("saludo")){
            Informacion info = new Informacion("saludo", "__");
            servicio.save(info);
        }

        if(!servicio.existsBySlug("sobremi")){
            Informacion info2 = new Informacion("sobremi", "__");
            servicio.save(info2);
        }

        if(!servicio.existsBySlug("url_imagen_sobremi")){
            Informacion info3 = new Informacion("url_imagen_sobremi", "__");
            servicio.save(info3);
        }

        if(!servicioUsuario.existsByUsuario("admin")){
            Set<Rol> roles = new HashSet<>();


            Optional<Rol> rol_admin = rolService.getByRolNombre(RolNombre.ROLE_ADMIN);
            roles.add(rol_admin.get());

            Usuario usuario = new Usuario(
                "admin",
                "Nombre Administrador",
                "Apellido Administrador",
                passwordEncoder.encode("admin123"),
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/User_icon_2.svg/1024px-User_icon_2.svg.png"
            );
            usuario.setRoles(roles);
            servicioUsuario.save(usuario);
        }

    }
}
