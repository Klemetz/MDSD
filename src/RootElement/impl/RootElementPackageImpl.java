/**
 */
package RootElement.impl;

import RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage;

import RootElement.BuisnessLogicLayer.impl.BuisnessLogicLayerPackageImpl;

import RootElement.Buissnesslayer.BuissnesslayerPackage;

import RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl;

import RootElement.Datalayer.DatalayerPackage;

import RootElement.Datalayer.impl.DatalayerPackageImpl;

import RootElement.Interaction1;
import RootElement.Interaction2;

import RootElement.Interactionlayer.InteractionlayerPackage;

import RootElement.Interactionlayer.impl.InteractionlayerPackageImpl;

import RootElement.RootElementFactory;
import RootElement.RootElementPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RootElementPackageImpl extends EPackageImpl implements RootElementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interaction1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interaction2EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RootElement.RootElementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RootElementPackageImpl() {
		super(eNS_URI, RootElementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RootElementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RootElementPackage init() {
		if (isInited) return (RootElementPackage)EPackage.Registry.INSTANCE.getEPackage(RootElementPackage.eNS_URI);

		// Obtain or create and register package
		RootElementPackageImpl theRootElementPackage = (RootElementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RootElementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RootElementPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DatalayerPackageImpl theDatalayerPackage = (DatalayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI) instanceof DatalayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI) : DatalayerPackage.eINSTANCE);
		BuissnesslayerPackageImpl theBuissnesslayerPackage = (BuissnesslayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI) instanceof BuissnesslayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI) : BuissnesslayerPackage.eINSTANCE);
		InteractionlayerPackageImpl theInteractionlayerPackage = (InteractionlayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionlayerPackage.eNS_URI) instanceof InteractionlayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionlayerPackage.eNS_URI) : InteractionlayerPackage.eINSTANCE);
		BuisnessLogicLayerPackageImpl theBuisnessLogicLayerPackage = (BuisnessLogicLayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuisnessLogicLayerPackage.eNS_URI) instanceof BuisnessLogicLayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuisnessLogicLayerPackage.eNS_URI) : BuisnessLogicLayerPackage.eINSTANCE);

		// Create package meta-data objects
		theRootElementPackage.createPackageContents();
		theDatalayerPackage.createPackageContents();
		theBuissnesslayerPackage.createPackageContents();
		theInteractionlayerPackage.createPackageContents();
		theBuisnessLogicLayerPackage.createPackageContents();

		// Initialize created meta-data
		theRootElementPackage.initializePackageContents();
		theDatalayerPackage.initializePackageContents();
		theBuissnesslayerPackage.initializePackageContents();
		theInteractionlayerPackage.initializePackageContents();
		theBuisnessLogicLayerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRootElementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RootElementPackage.eNS_URI, theRootElementPackage);
		return theRootElementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction1() {
		return interaction1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction2() {
		return interaction2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementFactory getRootElementFactory() {
		return (RootElementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		interaction1EClass = createEClass(INTERACTION1);

		interaction2EClass = createEClass(INTERACTION2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DatalayerPackage theDatalayerPackage = (DatalayerPackage)EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI);
		BuissnesslayerPackage theBuissnesslayerPackage = (BuissnesslayerPackage)EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI);
		InteractionlayerPackage theInteractionlayerPackage = (InteractionlayerPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionlayerPackage.eNS_URI);
		BuisnessLogicLayerPackage theBuisnessLogicLayerPackage = (BuisnessLogicLayerPackage)EPackage.Registry.INSTANCE.getEPackage(BuisnessLogicLayerPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDatalayerPackage);
		getESubpackages().add(theBuissnesslayerPackage);
		getESubpackages().add(theInteractionlayerPackage);
		getESubpackages().add(theBuisnessLogicLayerPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(interaction1EClass, Interaction1.class, "Interaction1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interaction2EClass, Interaction2.class, "Interaction2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RootElementPackageImpl
