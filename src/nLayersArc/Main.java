package nLayersArc;

import nLayersArc.business.abstracts.ProductService;
import nLayersArc.business.concretes.ProductManager;
import nLayersArc.core.concretes.JLoggerManagerAdapter;
import nLayersArc.dataAccess.concretes.AbcProductDao;
import nLayersArc.dataAccess.concretes.HibernateProductDao;
import nLayersArc.entities.concretes.Product;

//bir projede entityler hariç newleme var ise ileride de probleme sebebiyet verir
public class Main {
    public static void main(String[] args){
        //ToDo Spring IoC ile iyileştirilecek.
        //ToDo Interfacler somut sınıfların referansını tutabilir.
        ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        Product product=new Product(1,2,"Elma",12,50);
        productService.add(product);
    }
}
