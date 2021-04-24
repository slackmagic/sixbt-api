package ovh.sixbt.business;
import java.util.List;

public interface ISixBtDomain {
    List<String> getUsefulAddresses();
    void login(String user, String password);
}
