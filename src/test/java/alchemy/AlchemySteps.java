package alchemy;

import hw.block3lesson10.elements.*;
import hw.block3lesson10.elements.subElements.Energy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlchemySteps {
    private NatureElement air;
    private NatureElement earth;
    private NatureElement fire;
    private NatureElement water;
    private NatureElement result;

    @Given("I have an Air element")
    public void iHaveAnAirElement() {
        air = new Air();
    }

    @When("I connect Air with Fire")
    public void iConnectAirWithFire() {
        NatureElement otherElement = new Fire();
        result = air.connect(otherElement);
    }

    @Then("I should get Energy")
    public void iShouldGetEnergy() {
        assertEquals("Energy", result.getClass().getSimpleName());
    }

    @When("I connect Air with Air")
    public void iConnectAirWithAir() {
        NatureElement otherElement = new Air();
        result = air.connect(otherElement);
    }

    @Then("I should get Pressure")
    public void iShouldGetPressure() {
        assertEquals("Pressure", result.getClass().getSimpleName());
    }

    @When("I connect Air with Earth")
    public void iConnectAirWithEarth() {
        NatureElement otherElement = new Earth();
        result = air.connect(otherElement);
    }

    @Then("I should get Dust")
    public void iShouldGetDust() {
        assertEquals("Dust", result.getClass().getSimpleName());
    }

    @When("I connect Air with Water")
    public void iConnectAirWithWater() {
        NatureElement otherElement = new Water();
        result = air.connect(otherElement);
    }

    @Then("I should get Rain")
    public void iShouldGetRain() {
        assertEquals("Rain", result.getClass().getSimpleName());
    }

    @Given("I have an Earth element")
    public void iHaveAnEarthElement() {earth = new Earth();}

    @When("I connect Earth with Fire")
    public void iConnectEarthWithFire() {
        NatureElement otherElement = new Fire();
        result = earth.connect(otherElement);
    }

    @Then("I should get Lava")
    public void iShouldGetLava() {
        assertEquals("Lava", result.getClass().getSimpleName());
    }

    @When("I connect Earth with Air")
    public void iConnectEarthWithAir() {
        NatureElement otherElement = new Air();
        result = earth.connect(otherElement);
    }

    @When("I connect Earth with Earth")
    public void iConnectEarthWithEarth() {
        NatureElement otherElement = new Earth();
        result = earth.connect(otherElement);
    }

    @When("I connect Earth with Water")
    public void iConnectEarthWithWater() {
        NatureElement otherElement = new Water();
        result = earth.connect(otherElement);
    }

    @Then("I should get Mud")
    public void iShouldGetMud() {
        assertEquals("Mud", result.getClass().getSimpleName());
    }

    @Given("I have an Fire element")
    public void iHaveAnFireElement() {fire = new Fire();}

    @When("I connect Fire with Fire")
    public void iConnectFireWithFire() {
        NatureElement otherElement = new Fire();
        result = fire.connect(otherElement);
    }

    @Then("I should get Fire")
    public void iShouldGetFire()  {
        assertEquals("Fire", result.getClass().getSimpleName());
    }

    @When("I connect Fire with Air")
    public void iConnectFireWithAir() {
        NatureElement otherElement = new Air();
        result = fire.connect(otherElement);
    }

    @When("I connect Fire with Earth")
    public void iConnectFireWithEarth() {
        NatureElement otherElement = new Earth();
        result = fire.connect(otherElement);
    }

    @When("I connect Fire with Water")
    public void iConnectFireWithWater() {
        NatureElement otherElement = new Water();
        result = fire.connect(otherElement);
    }

    @Then("I should get Steam")
    public void iShouldGetSteam() {
        assertEquals("Steam", result.getClass().getSimpleName());
    }

    @Given("I have an Water element")
    public void iHaveAnWaterElement() {water = new Water();}

    @When("I connect Water with Fire")
    public void iConnectWaterWithFire() {
        NatureElement otherElement = new Fire();
        result = water.connect(otherElement);
    }

    @When("I connect Water with Air")
    public void iConnectWaterWithAir() {
        NatureElement otherElement = new Air();
        result = water.connect(otherElement);
    }

    @When("I connect Water with Earth")
    public void iConnectWaterWithEarth() {
        NatureElement otherElement = new Earth();
        result = water.connect(otherElement);
    }

    @When("I connect Water with Water")
    public void iConnectWaterWithWater() {
        NatureElement otherElement = new Water();
        result = water.connect(otherElement);
    }

    @Then("I should get Sea")
    public void iShouldGetSea() {
        assertEquals("Sea", result.getClass().getSimpleName());
    }

    @When("I connect Water with Energy")
    public void iConnectWaterWithEnergy() {
        NatureElement otherElement = new Energy();
        result = water.connect(otherElement);
    }
}
