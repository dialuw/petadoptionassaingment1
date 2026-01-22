import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PetDAO {

    public static void addPet(Pet pet) {
        try (Connection c = DB.getConnection();
             PreparedStatement ps = c.prepareStatement(
                     "INSERT INTO pets(name, age, type, adopted) VALUES (?, ?, ?, ?)"
             )) {

            ps.setString(1, pet.getName());
            ps.setInt(2, pet.getAge());
            ps.setString(3, pet.getType());
            ps.setBoolean(4, pet.isAdopted());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("DB INSERT ERROR: " + e.getMessage());
        }
    }

    public static void showPets() {
        try (Connection c = DB.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM pets")) {

            while (rs.next()) {
                System.out.println(
                        rs.getString("name") + " " +
                                rs.getInt("age") + " " +
                                rs.getString("type") + " " +
                                rs.getBoolean("adopted")
                );
            }

        } catch (Exception e) {
            System.out.println("DB SELECT ERROR: " + e.getMessage());
        }
    }

    public static void adoptPet(String name) {
        try (Connection c = DB.getConnection();
             PreparedStatement ps = c.prepareStatement(
                     "UPDATE pets SET adopted = true WHERE name = ?"
             )) {

            ps.setString(1, name);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("DB UPDATE ERROR: " + e.getMessage());
        }
    }
}
