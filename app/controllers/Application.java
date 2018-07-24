package controllers;

import models.Product;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import javax.persistence.criteria.From;

public class Application extends Controller {

    public static Result main(Html content) {
        return ok(main.render(content));
    }
    public static Result index(){
        return main(home_page.render());
    }
    public static Result Pro(){
        return main(Products .render());
    }
    public static Result Promo(){
        return main(Promotions.render());
    }
    public static Result Showpro(){
        String myname;
        Product pro1;
        pro1=new Product();
        pro1 .setId("ER001");
        pro1.setName("ปืนM416");
        pro1.setType("ปืน");
        pro1.setSize("เล็ก");
        pro1.setPrice(300);
        pro1.setAmount(20);


Product pro2 = new Product("ER002","ปืนAKM","ปืน","เล็ก",300,20);
Product pro3 = new Product("ER003","ปืนKRISS Vector","ปืน","เล็ก",300,20);
Product pro4 = new Product("DR004","กระเป๋าLevel 3","กระเป๋า","ใหญ่",1390,30);
Product pro5 = new Product("DR005","กระเป๋าLevel 3 ดำ","กระเป๋า","ใหญ่",1390,25);
Product pro6 = new Product("DR005","กระเป๋าLevel 3 ดำ","กระเป๋า","ใหญ่",1390,25);

return main(Showpro.render(pro1,pro2,pro3,pro4,pro5,pro6));


    }

    public static Result inputPro(){
        return main(inputPro.render()); }

    public static Result Showpro2() {
        DynamicForm myForm = Form.form().bindFromRequest();
        String id, name;
        int amount;
        int a;

        id = myForm.get("id");
        name = myForm.get("name");
        amount = Integer.parseInt(myForm.get("amount"));
        Product mypro = new Product();
        mypro.setId(id);
        mypro.setName(name);
        mypro.setAmount(amount);
        return main(Showpro2.render());

        return ok(); }




}
