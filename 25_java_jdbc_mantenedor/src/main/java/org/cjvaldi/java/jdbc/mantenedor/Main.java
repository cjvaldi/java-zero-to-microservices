package org.cjvaldi.java.jdbc.mantenedor;

import org.cjvaldi.java.jdbc.mantenedor.modelo.Usuario;
import org.cjvaldi.java.jdbc.mantenedor.repositorio.Repositorio;
import org.cjvaldi.java.jdbc.mantenedor.repositorio.UsuarioRepositorioImp;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Repositorio<Usuario> repositorio = new UsuarioRepositorioImp();
        int opcionIndice = 0;

        Map<String,Integer> operaciones = new HashMap<>();
        operaciones.put("Actualizar",1);
        operaciones.put("Eliminar",2);
        operaciones.put("Agregar",3);
        operaciones.put("Listar",4);
        operaciones.put("Salir",5);

        Object[] opArreglo =  operaciones.keySet().toArray();

        do{
            Object opcion = JOptionPane.showInputDialog(null,
                    "Selecciones una Operación",
                    "Mantenedor de Usuarios JDBC",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);
            if(opcion==null){
                JOptionPane.showMessageDialog(null,"Debe seleccionar una opción");
                continue;
            }
            opcionIndice = operaciones.get(opcion.toString());

            switch (opcionIndice){
                case 3 -> { // Agregar
                    String username = JOptionPane.showInputDialog("Ingrese el UserName :");
                    String password = JOptionPane.showInputDialog("Ingrese el Password :");
                    String email = JOptionPane.showInputDialog("Ingrese el Email :");

                    if(username != null && password!=null && email!=null){
                        repositorio.guardar(new Usuario(username,password,email));
                        JOptionPane.showMessageDialog(null, "Usuario agregado con éxito");
                    }
                }
                case 4-> { //listar
                    List<Usuario> usuarios = repositorio.listar();
                    StringBuilder sb = new StringBuilder("------- Lista de Usuarios --------\n");
                    usuarios.forEach(u->sb.append(u).append("\n"));
                    JOptionPane.showMessageDialog(null,sb.toString());
                }
                case 1->{ //Actualizar
                    String idStr = JOptionPane.showInputDialog("Ingrese el id del Usuario : ");
                    if(idStr != null ){
                        Long id = Long.parseLong(idStr);
                        Usuario usuarioExistente = repositorio.porId(id);

                        if(usuarioExistente != null){
                            String nuevoUser = JOptionPane.showInputDialog("Username actual: " + usuarioExistente.getUsername() + "\nIngrese nuevo username:");
                            String nuevoPass = JOptionPane.showInputDialog("Password actual: [OCULTO]\nIngrese nueva contraseña:");
                            String nuevoEmail = JOptionPane.showInputDialog("Email actual: " + usuarioExistente.getEmail() + "\nIngrese nuevo email:");

                            usuarioExistente.setUsername(nuevoUser);
                            usuarioExistente.setPassword(nuevoPass);
                            usuarioExistente.setEmail(nuevoEmail);

                            repositorio.guardar(usuarioExistente);
                            JOptionPane.showMessageDialog(null, "Usuario actualizado con éxito..!");
                        } else {
                            JOptionPane.showMessageDialog(null,"Error no se encontro ningun usuario con ese Id.");
                        }
                    }
                }
                case 2-> { // Eliminar
                    String idStr = JOptionPane.showInputDialog("Ingrese el Id del usuario a eliminar");
                    if(idStr!=null){
                        Long id = Long.parseLong(idStr);
                        if(repositorio.porId(id) != null){
                            repositorio.eliminar(id);
                            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                        }else{
                            JOptionPane.showMessageDialog(null,"Error, el usuario no existe...");
                        }
                    }
                }
                case 5-> JOptionPane.showMessageDialog(null,"Cerrando conexiones y saliendo de forma segura");
            }
        } while (opcionIndice != 5);
    }
}
