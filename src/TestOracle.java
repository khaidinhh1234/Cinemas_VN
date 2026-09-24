import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestOracle {

    public static void main(String[] args) {

        try {
            Connection conn = DBConnection.getConnection();

            System.out.println("Kết nối Oracle thành công!");
            System.out.println("===== DANH SÁCH PHIM =====");

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT MA_PHIM, TEN_PHIM, THE_LOAI, THOI_LUONG FROM PHIM");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("MA_PHIM") + " | "
                                + rs.getString("TEN_PHIM") + " | "
                                + rs.getString("THE_LOAI") + " | "
                                + rs.getInt("THOI_LUONG") + " phút");

            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}