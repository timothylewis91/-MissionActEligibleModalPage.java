package issPageClasses;

import platformIndependentCore.core.AutomatedObject;
import platformIndependentCore.core.Search;

/**
 * <b>Name :</b> MissionActEligibleModalPage.java
 * <p>
 * <b>Generated :</b> Apr 24, 2024
 * <p>
 * <b>Description :</b>page class for appointment successfully created modal
 * <p>
 *
 * @since Apr 24, 2024
 * @author OITLEXGreenA
 */
public class MissionActEligibleModalPage extends IssBase {

	/**
	 * Constructor
	 */
	public MissionActEligibleModalPage() {
		// This is a modal page so no specific page url
	}

	/**
	 * page classes and resources
	 */
	Resources r = new Resources();

	/**
	 * get the Mission Act Eligible Modal form object.
	 *
	 * @return object
	 */
	private AutomatedObject getMissionActEligibleModal() {
		return getObjectById("missionActEligibilityModal");
	}

	/**
	 * get Mission Act Eligible modal shadow root parent
	 *
	 * @return object appointment successfully created modal shadow root parent
	 */
	public AutomatedObject getMissionActEligibleShadowRootParent() {
		return getMissionActEligibleModal();

	}

	/**
	 * @return title of modal
	 */
	public String readTitleOfMissionActEligibleModal() {
		return getMissionActEligibleShadowRootParent().getPropertyValue("modaltitle");
	}

	/**
	 * @return get close button
	 */
	public AutomatedObject getBtnClose() {
		Search search = getSearch();
		// Set the shadow-root parent so that we can that object within that Shadow DOM
		search.setShadowRoot(getMissionActEligibleShadowRootParent());

		// Search for the text within this parent Shadow-DOM
		search.addCriteria("css", "#modal-primary-button");
		search.setCacheResult(false);
		return getObject(search);
	}

	/**
	 * click close button
	 */
	public void clickBtnClose() {
		getBtnClose().click();
	}

	/**
	 * @return get X button
	 */
	public AutomatedObject getBtnX() {

		Search search = getSearch();

		// Set the shadow-root parent so that we can that object within that Shadow DOM
		search.setShadowRoot(getMissionActEligibleShadowRootParent());

		// Search for the text within this parent Shadow-DOM
		search.addCriteria("css", "div > button");
		search.setCacheResult(false);
		return getObject(search);
	}

	/**
	 * is the Mission Act Eligible modal form displayed.
	 *
	 * @return true if form displayed
	 */
	public Boolean isMissionActEligibleFormDisplayed() {
		try {
			return getMissionActEligibleModal().isDisplayed();
		} catch (Exception ex) {
			return false;
		}
	}

}
