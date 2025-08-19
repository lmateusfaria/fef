package com.petSolidario.services;

import com.petSolidario.domains.Person;
import com.petSolidario.domains.Usuario;
import com.petSolidario.repositories.PersonRepository;
import com.petSolidario.repositories.UsuarioRepository;
import com.petSolidario.security.UserSS;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    //private final UsersRepository userRepository;
    private final UsuarioRepository usuarioRepository;

    //public UserDetailsServiceImpl(UsersRepository userRepository) {
    public UserDetailsServiceImpl(UsuarioRepository usuarioRepository) {
        //this.userRepository = userRepository;
        this.usuarioRepository = usuarioRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Optional<Users> user = userRepository.findByEmail(username);
        Optional<Usuario> user = usuarioRepository.findByEmail(username);
        if (user.isEmpty()) {
            throw new UsernameNotFoundException("User not found: " + username);
        }
        return new UserSS(user.orElse(null));
    }
}
