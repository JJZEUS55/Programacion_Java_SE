package Actions;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Login;
import entity.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ModifyAction extends ActionSupport {

    private List lista1;

    public List getLista() {
        return lista1;
    }

    public void setLista(List lista) {
        this.lista1 = lista;
    }

    public String execute() throws Exception {
        Session hibernateSession;

        hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Query consulta = hibernateSession.createQuery("from Login");
        lista1 = consulta.list();

        return SUCCESS;
    }
}
