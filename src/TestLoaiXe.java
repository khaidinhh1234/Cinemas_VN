import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestLoaiXe {

    public static void main(String[] args) {

        try {
            Connection conn = DBConnection.getConnection();

            System.out.println("Kết nối Oracle thành công!");
            System.out.println("===== DANH SÁCH LOẠI XE =====");

            Statement stmt = conn.createStatement();

            String sql = """
                    SELECT MA_LOAI_XE, TEN_LOAI_XE, MO_TA
                    FROM LOAI_XE
                    """;

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("MA_LOAI_XE") + " | "
                                + rs.getString("TEN_LOAI_XE") + " | "
                                + rs.getString("MO_TA"));
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}