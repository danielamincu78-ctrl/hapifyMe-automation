package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import pages.ProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;

public class ProfileSteps {
    ProfilePage profilePage = new ProfilePage();
    @When("utilizatorul apasa butonul Settings")
    public void accessSettings() {
        profilePage.openSettings();
    }

    @When("utilizatorul completeaza formularul cu urmatoarele date")
    public void completeProfile(DataTable dataTable) {

        List<Map<String, String>> profileData =
                dataTable.asMaps(String.class, String.class);

        Map<String, String> user = profileData.get(0);

        profilePage.setFirstName(user.get("firstName"));
        profilePage.setLastName(user.get("lastName"));
        profilePage.setEmail(user.get("email"));
    }

    @When("utilizatorul apasa butonul Update Details")
    public void updateButton() {
        profilePage.clickUpdate();
    }

    @Then("poate edita profilul")
    public void editProfile() {
        profilePage.verifySuccessMessage();
    }
}

