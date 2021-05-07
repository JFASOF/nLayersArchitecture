package nLayersArc.business.concretes;


import nLayersArc.business.abstracts.ProductService;
import nLayersArc.core.abstracts.LoggerService;
import nLayersArc.dataAccess.abstracts.ProductDao;
import nLayersArc.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {


    private ProductDao productDao;
    private LoggerService loggerService;
    //dependency inject
    //hibernate bağlılık söz konusu değil hibernatein referansı olan ProductDao nesnesi üzerinden işlem görür sonrdan değişimlerde.
    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        super();
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCatId() == 1) {
            System.out.println("Bu kategoride ürün kabul edilmyor");
            return;
        }
        this.productDao.addProduct(product);
        this.loggerService.logToSys("LogTamamlandı Ürün Eklendi:"+product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
