import java.util.List;
//reiziger interface overgenomen van het erd

public interface ReizigerDAO {
    boolean save(Reiziger reiziger);
    boolean update(Reiziger reiziger);
    boolean delete(Reiziger reiziger);
    Reiziger findById(int id);
    List<Reiziger> findByGbDatum(String datum);
    List<Reiziger> findAll();
}