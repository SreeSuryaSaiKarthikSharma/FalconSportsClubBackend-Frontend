//package com.ust.test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.ust.model.Students;
//import com.ust.repository.StudentsRepository;
//import com.ust.service.StudentsService;
//import com.ust.service.StudentsServiceImplementation;
//
//@ExtendWith(MockitoExtension.class)
//public class ServiceLayerTest {
//
//	@Mock
//	private StudentsRepository studentsRepository;
//	
//	@InjectMocks
//	private StudentsServiceImplementation studentsServiceImplementation;
//	
//	private StudentsService studentsService;
//	
//	private Students students;
//	
//	@BeforeEach
//	void initUseCase() {
//		studentsService = new StudentsServiceImplementation();	
//				
//	}
//	
//	@Test
//	public void saveStudent_Success() {
//		
//		Students students = new Students();
//		students.setStudent_id(1);
//		students.setStudent_name("Sree");
//		students.setStudent_institute("Vignan Institute");
//		students.setStudent_age(21);
//		students.setGender("male");
//		students.setEmail("sree@gmail.com");
//		
//		when(studentsRepository.save(any(Students.class))).thenReturn(students);
//		
//		Students savedStudent = studentsRepository.save(students);
//		assertThat(savedStudent.getStudent_name()).isNotNull();
//	}
////	
////	@Test
////	void deleteStudent() {
////		
////		doNothing().when(studentsRepository).deleteById(anyInt());
////		
////		
////	}
////	
//	
//
//	
//	
//	
//	
//	
////	@Test
////	public void student_exists_in_db_success() {
////		
////		Students students = new Students();
////		students.setStudent_id(1);
////		students.setStudent_name("Sree");
////		students.setStudent_institute("Vignan Institute");
////		students.setStudent_age(21);
////		students.setGender("male");
//////		students.setEmail("sree@gmail.com");
////	
////
////public class EstimationServiceTest {
////
////@Test
////public void testSetEstimationObjUsingRacks() {
////// Arrange
////double unitPrice = 10.0;
////double totalNoOfRacks = 5.0;
////double expectedEstimation = 50.0;
//
////
////EstimationService estimationService = new EstimationService();
////
////// Act
////double actualEstimation = estimationService.setEstimationObjUsingRacks(unitPrice, totalNoOfRacks);
////
////// Assert
////assertEquals(expectedEstimation, actualEstimation, 0.001); // Specify delta for double comparison
////}
////	
//	
//
////	@Test
////	public void testDeleteBySizingId() {
////	// Arrange
////	long sizingId = 12345;
////	boolean isDelete = true;
////	List<CapacityEstimationDetails> capacityEstimationDetails = new ArrayList<>();
////	Mockito.when(capacityEstimationRepository.findByCapacitySizingId(sizingId)).thenReturn(capacityEstimationDetails);
////
////	// Act
////	boolean result = capacityEstimationService.deleteBySizingId(sizingId, isDelete);
////
////	// Assert
////	assertTrue(result);
////	if (isDelete) {
////	Mockito.verify(capacityEstimationRepository, Mockito.times(1)).deleteAll(capacityEstimationDetails);
////	} else {
////	Mockito.verify(capacityEstimationRepository, Mockito.times(1)).saveAll(capacityEstimationDetails);
////	}
////	}
////	}
////		List<Students> studentsList = new ArrayList<>();
////		studentsList.add(students);
////		
////		when(studentsRepository.findAll()).thenReturn(studentsList);
////		
////		List<Students> fetchedStudents = studentsService.getAllstudents();
////		assertThat(fetchedStudents.size()).isLessThan(0);
////		
////	}
////	[16:30] Sree Surya Sai Karthik Chamarthi(UST,IN)
////
////	import org.junit.jupiter.api.Assertions;
////
////	import org.junit.jupiter.api.Test;
////
////
////	public class CapacityEstimationTest {
////
////
////	    @Test
////
////	    public void testSetQuarterlyBreakUp() {
////
////	        // Create CapacitySizingDetails object
////
////	        CapacitySizingDetails capacitySizingDetails = new CapacitySizingDetails();
////
////	        capacitySizingDetails.setQ1Percentage(50);
////
////	        capacitySizingDetails.setQ2Percentage(30);
////
////	        capacitySizingDetails.setQ3Percentage(15);
////
////	        capacitySizingDetails.setQ4Percentage(5);
////
////
////	        // Create CapacityEstimationDetails object
////
////	        CapacityEstimationDetails capacityEstimationDetails = new CapacityEstimationDetails();
////
////	        capacityEstimationDetails.setTotalAmount(1000.0);
////
////
////	        // Create an instance of the class containing the setQuarterlyBreakUp method
////
////	        CapacityEstimation capacityEstimation = new CapacityEstimation();
////
////
////	        // Call the method under test
////
////	        CapacityEstimationDetails result = capacityEstimation.setQuarterlyBreakUp(capacitySizingDetails, capacityEstimationDetails);
////
////
////	        // Assert the expected values
////
////	        Assertions.assertEquals(500.0, result.getQ1Amount());
////
////	        Assertions.assertEquals(300.0, result.getQ2Amount());
////
////	        Assertions.assertEquals(150.0, result.getQ3Amount());
////
////	        Assertions.assertEquals(50.0, result.getQ4Amount());
////
////	    }
////
////	}
////
////	import org.junit.jupiter.api.Assertions;
////	import org.junit.jupiter.api.BeforeEach;
////	import org.junit.jupiter.api.Test;
////	import org.mockito.InjectMocks;
////	import org.mockito.Mock;
////	import org.mockito.Mockito;
////	import org.mockito.MockitoAnnotations;
////
////	public class CalculatorServiceTest {
////
////	@Mock
////	private CalculatorVariableService calculatorVariableService;
////
////	@Mock
////	private PricingService pricingService;
////
////	@InjectMocks
////	private CalculatorService calculatorService;
////
////	@BeforeEach
////	public void setup() {
////	MockitoAnnotations.initMocks(this);
////	}
////
////	@Test
////	public void testGetIndividualCalvar() {
////	// Prepare test data
////	Long calvarId = 123L;
////	String calvarName = "TestCalvar";
////	CalculatorVariables expectedCalvarObj = new CalculatorVariables();
////	expectedCalvarObj.setId(calvarId);
////	expectedCalvarObj.setCalculatorVariableName(calvarName);
////
////	// Mock the dependencies
////	Pageable pageable = PageRequest.of(8, 25);
////	Page<CalculatorVariables> mockPage = Mockito.mock(Page.class);
////	Mockito.when(mockPage.getContent()).thenReturn(Collections.singletonList(expectedCalvarObj));
////	Mockito.when(calculatorVariableService.searchCalculatorVariable(Mockito.any(CalculatorVariables.class), Mockito.eq(pageable))).thenReturn(mockPage);
////
////	// Call the private method
////	CalculatorVariables result = calculatorService.getIndividualCalvar(calvarId, calvarName);
////
////	// Verify the dependencies were called with correct arguments
////	Mockito.verify(calculatorVariableService).searchCalculatorVariable(Mockito.any(CalculatorVariables.class), Mockito.eq(pageable));
////
////	// Assert the expected result
////	Assertions.assertEquals(expectedCalvarObj, result);
////	}
////
////	@Test
////	public void testGetPriceVariable() {
////	// Prepare test data
////	String fiscalYear = "2023";
////	CalculatorVariables calculatorVariables = new CalculatorVariables();
////	calculatorVariables.setId(123L);
////
////	CalculatorVariables expectedPriceObj = new CalculatorVariables();
////	expectedPriceObj.setId(456L);
////
////	// Mock the dependencies
////	Mockito.when(pricingService.getPricingOnFYandCALVARID(Mockito.eq(fiscalYear), Mockito.eq(calculatorVariables.getId())))
////	.thenReturn(expectedPriceObj);
////
////	// Call the private method
////	CalculatorVariables result = calculatorService.getPriceVariable(fiscalYear, calculatorVariables);
////
////	// Verify the dependencies were called with correct arguments
////	Mockito.verify(pricingService).getPricingOnFYandCALVARID(Mockito.eq(fiscalYear), Mockito.eq(calculatorVariables.getId()));
////
////	// Assert the expected result
////	Assertions.assertEquals(expectedPriceObj, result);
////	}
////	}
//	
//
////@Test
////public void testCalculateIndividualCalvar() throws Exception {
////// Create an instance of the CalculatorService class
////CalculatorService calculatorService = new CalculatorService();
////
////// Access the private calculateIndividualCalvar method via reflection
////Method calculateIndividualCalvarMethod = CalculatorService.class.getDeclaredMethod("calculateIndividualCalvar", Long.class);
////calculateIndividualCalvarMethod.setAccessible(true);
////
////// Prepare test data
////Long calvarId = 123L;
////
////// Call the private method
////CalculatorVariables result = (CalculatorVariables) calculateIndividualCalvarMethod.invoke(calculatorService, calvarId);
////
////// Assert the expected result
////Assertions.assertNotNull(result);
////// Additional assertions based on the expected behavior of calculateIndividualCalvar
////}
////}
////	
////
////public class CalculatorServiceTest {
////
////@Mock
////private CalculatorVariableService calculatorVariableService;
////
////@Mock
////private PricingService pricingService;
////
////@InjectMocks
////private CalculatorService calculatorService;
////
////@BeforeEach
////public void setup() {
////MockitoAnnotations.initMocks(this);
////}
////
////@Test
////public void testGetPriceVariable() throws Exception {
////// Create an instance of the CalculatorService class
////CalculatorService calculatorService = new CalculatorService();
////
////// Access the private getPriceVariable method via reflection
////Method getPriceVariableMethod = CalculatorService.class.getDeclaredMethod("getPriceVariable", String.class, CalculatorVariables.class);
////getPriceVariableMethod.setAccessible(true);
////
////// Prepare test data
////String fiscalYear = "2023";
////CalculatorVariables calculatorVariables = new CalculatorVariables();
////// Set other necessary properties of calculatorVariables
////
////// Mock the dependencies
////Mockito.when(pricingService.getPricingOnFYandCALVARID(Mockito.eq(fiscalYear), Mockito.anyLong()))
////.thenReturn(new CalculatorVariables());
////
////// Call the private method
////CalculatorVariables result = (CalculatorVariables) getPriceVariableMethod.invoke(calculatorService, fiscalYear, calculatorVariables);
////
////// Assert the expected result
////Assertions.assertNotNull(result);
////// Additional assertions based on the expected behavior of getPriceVariable
////}
//}
//
