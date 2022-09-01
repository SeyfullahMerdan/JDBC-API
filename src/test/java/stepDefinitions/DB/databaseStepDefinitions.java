package stepDefinitions.DB;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigReader;
import static io.restassured.RestAssured.given;
import static utilities.Authentication2.generateToken;
import static utilities.DBUtils.createConnection;
import static utilities.DBUtils.executeQuery;

public class databaseStepDefinitions {



    @Given("kullanici connection olusturur")
    public void kullaniciConnectionOlusturur() {


        createConnection();


    }

    @And("kullanici query sorgusu yapar")
    public void kullaniciQuerySorgusuYapar() {

        String query="Select * from jhi_user";

        executeQuery(query);

    }


    @Then("kullanici deneme yapar")
    public void kullaniciDenemeYapar() {
    }

    @Then("kullanici deneme{int} yapar")
    public void kullaniciDenemeYapar(int arg0) {
    }
}
