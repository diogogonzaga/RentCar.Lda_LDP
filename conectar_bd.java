import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class conectar_bd {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://db.xjbhrotlknhotrfnyhqc.supabase.co:5432/postgres";
         String user = "postgres";
         String pass = "5LnFVgYCqlCP";
    
        System.out.println("--- Iniciando conexão com o Supabase ---");
    
    
    try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            
            if (conn != null) {
                System.out.println("✅ SUCESSO: O Java conectou-se à base de dados!");
                
                // Aqui podes testar uma pequena query se quiseres
                System.out.println("Versão do Banco: " + conn.getMetaData().getDatabaseProductVersion());
            }

        } catch (SQLException e) {
            System.err.println("❌ ERRO de Conexão!");
            System.err.println("Mensagem técnica: " + e.getMessage());
            
            // Dica amigável para problemas comuns:
            if (e.getMessage().contains("refused")) {
                System.out.println("\n💡 DICA: Tenta mudar a porta 5432 para 6543 no teu código.");
            }
        }
        }



}
