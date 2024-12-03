package co.sumit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    //1.Need a Security Filter chain bean
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity
		.csrf(csrf->csrf.disable())//or .csrf(Customizer.withDefaults()) to apply csrf token
		.authorizeHttpRequests(request->{
			request
			.requestMatchers("register","login").permitAll()//for registration why user needs to be authenticated?
			.anyRequest().authenticated();
		}).formLogin(Customizer.withDefaults())
		.httpBasic(Customizer.withDefaults());
		return httpSecurity.build();
	}
}
