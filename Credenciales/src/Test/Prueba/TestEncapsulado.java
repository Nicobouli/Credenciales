
package Test.Prueba;

import mx.uamex.dto.SesionDeUsuario;


public class TestEncapsulado {
    
    public static void main(String[] args) {
testLogin();
testHackeo();
}
public static void testLogin() {
SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
sesionDeUsuario.setUsuario("antonio");
sesionDeUsuario.setPassword("password");
sesionDeUsuario.doLogin();
if(sesionDeUsuario.isLoggedIn()) {
System.out.println("Bienvenido "+sesionDeUsuario.getUsuario());
}else {
System.out.println("Su usuario o contraseña están equivocados");
}
}
public static void testHackeo() {
SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
sesionDeUsuario.getPassword();
sesionDeUsuario.setLoggedIn(true);
}
}
    
// Aca hacemos login a nuestra cuenta, la cual pasara por el testhaceko y vera su veracidad en la base de datos//
