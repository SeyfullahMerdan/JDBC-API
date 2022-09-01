package stepDefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.Room1Post;

public class apiStepDefinition02 {

    Response response;

    Room1Post room1Post = new Room1Post();





    @Given("kullanici roomlar icin post request yapar")
    public void kullanici_roomlar_icin_post_request_yapar() {

        //Set the expected data / istenilen datayi ekle
        room1Post.setRoomType("TWIN");
        room1Post.setPrice(500);
        room1Post.setRoomNumber(10293874);
        room1Post.setStatus(true);
        room1Post.setDescription("Techproed TWIN Room");





    }



    @When("kullanici post request validation yapar")
    public void kullanici_post_request_validation_yapar() {










    }













}
