package security;

// @Configuration
// public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
// // @Override
// // protected void configure(HttpSecurity httpSecurity) throws Exception {
// //
// httpSecurity.authorizeRequests().antMatchers("/").permitAll().and().authorizeRequests()
// // .antMatchers("/h2-console/**").permitAll();
// //
// // httpSecurity.csrf().disable();
// // httpSecurity.headers().frameOptions().disable();
// // }
//
// @Override
// protected void configure(HttpSecurity http) throws Exception {
// http.authorizeRequests().antMatchers("/addItemPage",
// "/addItemPage").permitAll()
// .antMatchers("/addItemPage",
// "/h2-console/**").hasRole("ADMIN").anyRequest().authenticated().and()
// .formLogin().loginPage("/login").permitAll().and().logout().permitAll();
// http.exceptionHandling().accessDeniedPage("/403");
// http.csrf().disable();
// http.headers().frameOptions().disable();
// }
//
// @Autowired
// public void configureGlobal(AuthenticationManagerBuilder auth) throws
// Exception {
// auth.inMemoryAuthentication().withUser("user").password("user").roles("USER").and().withUser("admin")
// .password("admin").roles("ADMIN");
// }
//
// }
