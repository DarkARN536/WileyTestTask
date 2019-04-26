package com.wilkey.tests;

import com.wilkey.pages.EducationPage;
import com.wilkey.pages.HomePage;
import com.wilkey.pages.SearchPage;
import com.wilkey.pages.StudentsPage;
import com.wilkey.webtestsbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;

@Test(groups = "Part 1. Java and Selenium WebDriver")
public class ScenarioWebDriverTests extends TestBase {
    HomePage homePage;
    StudentsPage studentsPage;
    EducationPage educationPage;
    SearchPage searchPage;

    @BeforeClass
    @Override
    protected void BeforeClass() {
        super.BeforeClass();
        homePage = new HomePage();
        studentsPage = new StudentsPage();
        educationPage = new EducationPage();
        searchPage = new SearchPage();
        homePage.openPage();
        homePage.clickButtonYesOnModal();
    }

    @Test(priority = 0, description = "Checking the display of the link 'Who We Serve'")
    public void DisplayedLinkWhoWeServe() {
        Assert.assertTrue(homePage.header.getTextLinkWhoWeServe().equalsIgnoreCase("who we serve"),"Item not found");
    }

    @Test(priority = 0, description = "Checking the display of the link 'Subjects'")
    public void DisplayedLinkSubjects() {
        Assert.assertTrue(homePage.header.getTextSubjects().equalsIgnoreCase("subjects"),"Item not found");
    }

    @Test(priority = 0, description = "Checking the display of the link 'About'")
    public void DisplayedLinkAbout() {
        Assert.assertTrue(homePage.header.getTextLinkAbout().equalsIgnoreCase("about"),"Item not found");
    }

    /**
     * Bug#1 - In the job written test 11 items, but their 12. In the test value from the task
     */
    @Test(priority = 1, description = "Checking number sub-headers under 'Who We Serve'")
    public void CountSubHeadersUnderWhoWeServe() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getSizeSubHeaderUnderWhoWeServe(), 11, "Menu not opened");
    }

    @Test(priority = 1, description = "Checking the name of sub-header 'Students'")
    public void CheckSubHeaderTitleStudents() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(0), "Students", "Invalid name of sub-header");
    }

    @Test(priority = 1, description = "Checking the name of sub-header 'Instructors'")
    public void CheckSubHeaderTitleInstructors() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(1), "Instructors", "Invalid name of sub-header");
    }

    @Test(priority = 1, description = "Checking the name of sub-header 'Book Authors'")
    public void CheckSubHeaderTitleBookAuthors() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(2), "Book Authors", "Invalid name of sub-header");
    }

    @Test(priority = 1, description = "Checking the name of sub-header 'Professionals'")
    public void CheckSubHeaderTitleProfessionals() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(3), "Professionals", "Invalid name of sub-header");
    }

    @Test(priority = 1, description = "Checking the name of sub-header 'Researchers'")
    public void CheckSubHeaderTitleResearchers() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(4), "Researchers", "Invalid name of sub-header");
    }

    @Test(priority = 1, description = "Checking the name of sub-header 'Institutions'")
    public void CheckSubHeaderTitleInstitutions() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(5), "Institutions", "Invalid name of sub-header");
    }

    @Test(priority = 1, description = "Checking the name of sub-header 'Librarians'")
    public void CheckSubHeaderTitleLibrarians() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(6), "Librarians", "Invalid name of sub-header");
    }

    @Test(priority = 1, description = "Checking the name of sub-header 'Corporations'")
    public void CheckSubHeaderTitleCorporations() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(7), "Corporations", "Invalid name of sub-header");
    }

    @Test(priority = 1, description = "Checking the name of sub-header 'Societies'")
    public void CheckSubHeaderTitleSocieties() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(8), "Societies", "Invalid name of sub-header");
    }

    @Test(priority = 1, description = "Checking the name of sub-header 'Journal Editors'")
    public void CheckSubHeaderTitleJournalEditors() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(9), "Journal Editors", "Invalid name of sub-header");
    }

    /**
     * Test on item, that is not in the task
     */
    @Test(priority = 1, description = "Checking the name of sub-header 'Bookstores'")
    public void CheckSubHeaderTitleBookstores() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(10), "Bookstores", "Invalid name of sub-header");
    }

    @Test(priority = 1, description = "Checking the name of sub-header 'Government'")
    public void CheckSubHeaderTitleGovernment() {
        homePage.header.hoverCursorOnLinkWhoWeServe();
        Assert.assertEquals(homePage.header.getTextTitleSubHeaderOnLinkWhoWeServe(11), "Government", "Invalid name of sub-header");
    }

    @Test(priority = 2, description = "Checking the link 'Students'")
    public void GoToLinkStudents() {
        homePage.header.clickOnLinkStudents();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.wiley.com/en-us/students", "Did't go to page");
    }

    @Test(priority = 3, description = "Checking display the header 'Students'")
    public void DisplayedHeaderStudents() {
        Assert.assertTrue(studentsPage.isDisplayedHeaderStudents(), "Header not found");
    }

    @Test(priority = 3, description = "Checking the link 'Learn More' in 'Be Your Best' block")
    public void GoToOnLinkLearnMoreInBeYourBest() {
        studentsPage.clickOnLinkLearnMore(0);
        Assert.assertTrue(studentsPage.getUrlAndGoBack().contains("www.wileyplus.com"), "Url does not lead to www.wileyplus.com");
    }

    @Test(priority = 3, description = "Checking the link 'Learn More' in 'Be Inquisitive' block")
    public void GoToOnLinkLearnMoreInBeInquisitive() {
        studentsPage.clickOnLinkLearnMore(1);
        Assert.assertTrue(studentsPage.getUrlAndGoBack().contains("www.wileyplus.com"), "Url does not lead to www.wileyplus.com");
    }

    @Test(priority = 3, description = "Checking the link 'Learn More' in 'Be Smart' block")
    public void GoToOnLinkLearnMoreInBeSmart() {
        studentsPage.clickOnLinkLearnMore(2);
        Assert.assertTrue(studentsPage.getUrlAndGoBack().contains("www.wileyplus.com"), "Url does not lead to www.wileyplus.com");
    }

    @Test(priority = 4, description = "Checking displayed the header 'Education'")
    public void GoToOnLinkEducation() {
        studentsPage.header.clickOnLinkEducation();
        Assert.assertTrue(educationPage.isDisplayedHeaderEducation(), "Header not found");
    }

    @Test(priority = 5, description = "Checking number items on the left side of the screen 'Subjects'")
    public void CountItemsOnSubjects() {
        Assert.assertEquals(educationPage.getSizeItemsOnSubjects(), 13, "Menu not displayed");
    }

    @Test(priority = 5, description = "Checking the name of item 'Information & Library Science'")
    public void CheckTitleItemInformationAndLibraryScience() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(0), "Information & Library Science", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'Education & Public Policy'")
    public void CheckTitleItemEducationAndPublicPolicy() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(1), "Education & Public Policy", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'K-12 General'")
    public void CheckTitleItemK12General() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(2), "K-12 General", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'Higher Education General'")
    public void CheckTitleItemHigherEducationGeneral() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(3), "Higher Education General", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'Vocational Technology'")
    public void CheckTitleItemVocationalTechnology() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(4), "Vocational Technology", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'Conflict Resolution & Mediation (School settings)'")
    public void CheckTitleItemConflictResolutionAndMediation() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(5), "Conflict Resolution & Mediation (School settings)", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'Curriculum Tools- General'")
    public void CheckTitleItemCurriculumToolsGeneral() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(6), "Curriculum Tools- General", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'Special Educational Needs'")
    public void CheckTitleItemSpecialEducationalNeeds() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(7), "Special Educational Needs", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'Theory of Education'")
    public void CheckTitleItemTheoryOfEducation() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(8), "Theory of Education", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'Education Special Topics'")
    public void CheckTitleItemEducationSpecialTopics() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(9), "Education Special Topics", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'Educational Research & Statistics'")
    public void CheckTitleItemEducationalResearchAndStatistics() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(10), "Educational Research & Statistics", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'Literacy & Reading'")
    public void CheckTitleItemLiteracyAndReading() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(11), "Literacy & Reading", "Invalid link text");
    }

    @Test(priority = 5, description = "Checking the name of item 'Classroom Management'")
    public void CheckTitleItemClassroomManagement() {
        Assert.assertEquals(educationPage.getTextTitleItemsOnSubjects(12), "Classroom Management", "Invalid link text");
    }

    @Test(priority = 6, description = "Checking the logo in header")
    public void GoToHomePageFromLogoWileyInHeader() {
        educationPage.header.clickLogoWileyInHeader();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.wiley.com/en-us", "Did't go to page");
    }

    @Test(priority = 7, description = "Checking the button search (search field is empty)")
    public void CheckButtonSearch() {
        homePage.searchInput.clickButtonSearch();
        Assert.assertEquals(homePage.getTextLinkLearnMoreAboutUs(),"LEARN MORE ABOUT US","Not left on the main page");
    }

    @Test(priority = 8, description = "Checking display area is result of search")
    public void AreaWithContentOfSearchIsDisplayed() {
        homePage.searchInput.enterWordInInputSearch("Java");
        Assert.assertTrue(homePage.searchInput.isDisplayedAreaWithContentOfSearch(),"No results displayed");
    }

    @Test(priority = 9, description = "Checking number results of search in section 'Suggestions'")
    public void CountSearchSectionSuggestions() {
        Assert.assertEquals(homePage.searchInput.getSizeSearchSectionSuggestions(), 4, "Invalid number of search results");
    }

    /**
     * Bug#2 - In the job written test 5 items, but their 4. In the test value from the task
     */
    @Test(priority = 9, description = "Checking number results of search in section 'Products'")
    public void CountSearchSectionProducts() {
        Assert.assertEquals(homePage.searchInput.getSizeSearchSectionProducts(), 5, "Invalid number of search results");
    }

    @Test(priority = 10, description = "Checking number results of search where there is word 'Java'")
    public void CountTitlesWithJava() {
        homePage.searchInput.clickButtonSearch();
        Assert.assertEquals(searchPage.getSizeTitlesWithJava(), searchPage.getSizeAllSearchTitles(), "Not all search results include the word 'Java'");
    }

    @Test(priority = 11, description = "Checking number results of search where there is button 'Add To Cart'")
    public void CountTitlesWithButtonAddToCart() {
        Assert.assertEquals(searchPage.findButtonAddToCart(), searchPage.getSizeAllSearchTitles(), "No search results with button 'Add To Cart'");
    }

    @Test(priority = 12, description = "Check the number of search results when of again press the button 'Search'")
    public void CountTitlesIfPressSearchAgain() {
        int countTitlesBeforePressSearch = searchPage.getSizeAllSearchTitles();
        homePage.searchInput.enterWordInInputSearch("Java");
        homePage.searchInput.clickButtonSearch();
        int countTitlesAfterPressSearch = searchPage.getSizeAllSearchTitles();
        Assert.assertEquals(countTitlesBeforePressSearch, countTitlesAfterPressSearch, "After searching again, the number of results changed");
    }
}