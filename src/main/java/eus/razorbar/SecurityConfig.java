package eus.razorbar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	 @Override
	 protected void configure(HttpSecurity http) throws Exception{
		 http.authorizeRequests()
		 	.antMatchers("/users").authenticated()
		 	.antMatchers("/users/kaixo").hasRole("ADMIN")
		 	.anyRequest().permitAll()
	 	.and()
	 		.formLogin().defaultSuccessUrl("/users")
 		.and()
 			.logout().logoutSuccessUrl("/").logoutUrl("/logout")
		.and()
 			.sessionManagement().invalidSessionUrl("/").maximumSessions(1).maxSessionsPreventsLogin(false);
	 }

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("iker").password("irazu").roles("USER", "ADMIN").accountLocked(false).and()
			.withUser("asdf").password("asdf").roles("USER");
		
	}
	
	/**
	 * http://stackoverflow.com/a/20925923
	 */
	@Bean
	@Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
