import java.util.List;

//OVChipkaart interface overgenomen van het erd

public interface OVChipkaartDAO {
    List<OVChipkaart> findByReiziger(Reiziger reiziger);
    boolean save(OVChipkaart ovChipkaart);
    boolean update(OVChipkaart ovChipkaart);
    boolean delete(OVChipkaart ovChipkaart);
}
