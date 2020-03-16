package control;

import control.ExitAction;
import control.CascadeAction;
import control.TileHorizontallyAction;
import control.TileVerticallyAction;
import control.OpenAbout;
import control.CircleToolAction;
import control.DiagramToolAction;
import control.RectangleToolAction;

public class ActionManager {

	private NewProjectAction newProjectAction = new NewProjectAction();
	private NewDiagramAction newDiagramAction = new NewDiagramAction();
	private ExitAction exitAction = new ExitAction();
	private CascadeAction cascadeAction = new CascadeAction();
	private TileVerticallyAction tileVerticallyAction = new TileVerticallyAction();
	private TileHorizontallyAction tileHorizontallyAction = new TileHorizontallyAction();
	private OpenAbout openAbout = new OpenAbout();
	private SwitchWorkspaceAction switchWorkspaceAction = new SwitchWorkspaceAction();
	private NextWindowAction nextWindowAction = new NextWindowAction();
	private PreviousWindowAction previousWindowAction = new PreviousWindowAction();
	private SaveProjectAction saveProjectAction = new SaveProjectAction();

	// toolbar Actions
	private CircleToolAction circleToolAction = new CircleToolAction();
	private RectangleToolAction rectangleToolAction = new RectangleToolAction();
	private DiagramToolAction diagramToolAction = new DiagramToolAction();

	public ActionManager() {
		super();
	}
	
	public SaveProjectAction getSaveProjectAction() {
		return saveProjectAction;
	}

	public void setSaveProjectAction(SaveProjectAction saveProjectAction) {
		this.saveProjectAction = saveProjectAction;
	}

	

	public void setNewProjectAction(NewProjectAction newProjectAction) {
		this.newProjectAction = newProjectAction;
	}

	public NewProjectAction getNewProjectAction() {
		return newProjectAction;
	}

	public NewDiagramAction getNewDiagramAction() {
		return newDiagramAction;
	}

	public ExitAction getExitAction() {
		return exitAction;
	}

	public CascadeAction getCascadeWindowsAction() {
		return cascadeAction;
	}

	public void setCascadeAction(CascadeAction cascadeWindowsAction) {
		this.cascadeAction = cascadeWindowsAction;
	}

	public TileVerticallyAction getTileVerticallyAction() {
		return tileVerticallyAction;
	}

	public void setTileVerticallyAction(
			TileVerticallyAction tileVerticallyAction) {
		this.tileVerticallyAction = tileVerticallyAction;
	}

	public TileHorizontallyAction getTileHorizontallyAction() {
		return tileHorizontallyAction;
	}

	public void setTileWindowsHorizontallyAction(
			TileHorizontallyAction tileHorizontallyAction) {
		this.tileHorizontallyAction = tileHorizontallyAction;
	}

	public void setOpenAbout(OpenAbout openAbout) {
		this.openAbout = openAbout;
	}

	public OpenAbout getOpenAbout() {
		return openAbout;
	}

	// toolbar actions


	public CircleToolAction getCircleToolAction() {
		return circleToolAction;
	}

	public void setCircleToolAction(CircleToolAction circleToolAction) {
		this.circleToolAction = circleToolAction;
	}

	public RectangleToolAction getRectangleToolAction() {
		return rectangleToolAction;
	}

	public void setRectangleToolAction(RectangleToolAction rectangleToolAction) {
		this.rectangleToolAction = rectangleToolAction;
	}

	public DiagramToolAction getDiagramToolAction() {
		return diagramToolAction;
	}

	public void setDiagramToolAction(DiagramToolAction diagramToolAction) {
		this.diagramToolAction = diagramToolAction;
	}

	public SwitchWorkspaceAction getSwitchWorkspaceAction() {
		return switchWorkspaceAction;
	}

	public void setSwitchWorkspaceAction(
			SwitchWorkspaceAction switchWorkspaceAction) {
		this.switchWorkspaceAction = switchWorkspaceAction;
	}

	public NextWindowAction getNextWindowAction() {
		return nextWindowAction;
	}

	public void setNextWindowAction(NextWindowAction nextWindowAction) {
		this.nextWindowAction = nextWindowAction;
	}

	public PreviousWindowAction getPreviousWindowAction() {
		return previousWindowAction;
	}

	public void setPreviousWindowAction(
			PreviousWindowAction previousWindowAction) {
		this.previousWindowAction = previousWindowAction;
	}

}
