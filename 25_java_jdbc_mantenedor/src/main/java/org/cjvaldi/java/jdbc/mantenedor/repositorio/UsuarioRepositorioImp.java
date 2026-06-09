package org.cjvaldi.java.jdbc.mantenedor.repositorio;

import org.cjvaldi.java.jdbc.mantenedor.modelo.Usuario;
import org.cjvaldi.java.jdbc.mantenedor.util.ConexionBaseDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorioImp implements Repositorio<Usuario> {
    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try (Connection conn = ConexionBaseDatos.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                usuarios.add(crearUsuario(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }


    @Override
    public Usuario porId(Long id) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuarios WHERE id = ? ";

        try (Connection conn = ConexionBaseDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    usuario = crearUsuario(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public void guardar(Usuario usuario) {
        String sql;
        boolean esActualizacion = usuario.getId() != null && usuario.getId() > 0;
        if (esActualizacion) {
            sql = "UPDATE usuarios SET username=?, password=?, email=? WHERE id=?";
        } else {
            sql = "INSERT INTO usuarios(username,password,email) VALUES(?,?,?)";
        }

        try (Connection conn = ConexionBaseDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getEmail());

            if (esActualizacion) {
                stmt.setLong(4, usuario.getId());
            }
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void eliminar(Long id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try (Connection conn = ConexionBaseDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // Helper para mapear el ResultSet a objeto Usuario
    private Usuario crearUsuario(ResultSet rs) throws SQLException {
        return new Usuario(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("email")
        );
    }
}
