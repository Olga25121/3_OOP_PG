package HW.hw_6_rightDecision.Controller;

import java.util.List;

import HW.hw_6_rightDecision.Model.PrintedProduct;
import HW.hw_6_rightDecision.Service.PrintedProductService;


public class PrintProductController<T> {
    PrintedProductService bookService = new PrintedProductService<>();
    
    public void addProductList(T product){
        bookService.addProduct(product);

    }

    public List<T> getInProductsList() {
        return bookService.getInProductsList();
    }

    public void outProduct(T product) {
        bookService.outProduct(product);

    }


    public List<T> getOutProductsList() {
        return bookService.getOutProductsList();
    }


    
}