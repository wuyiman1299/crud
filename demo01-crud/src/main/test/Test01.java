import com.kgc.dao.NewsDao;
import com.kgc.dao.impl.NewsDaoImpl;

public class Test01 {
    public static void main(String[] args) {
        // ����ӿڱ��
        NewsDao newsDao = new NewsDaoImpl();
        newsDao.getNewsList();


    }

}
