package com.termOneExam.simpleCalculator.service;

import com.termOneExam.simpleCalculator.dto.DoMathRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTests {
//    @Mock
//    private DonorRepository donorRepositoryMock;
//
//    @InjectMocks
//    private DonorServiceImpl serviceImpl;
//
//    private Donor donor = new Donor(1, "Clarisee", "Iradukunda", "cla@gmail.com","B-",2 );
//    @Test
//    public void givenDonorObject_returnDonorObject() throws Exception {
//        when(donorRepositoryMock.findById(donor.getId())).thenReturn(Optional.empty());
//        Donor savedDonor = serviceImpl.saveDonor(donor);
//
//
//        when(donorRepositoryMock.save(donor)).thenReturn(donor);
//        System.out.println(donorRepositoryMock);
//        System.out.println(serviceImpl);
//        System.out.println(savedDonor);
//        assertThat(savedDonor).isNotNull();
//    }
    private DoMathRequest doMathRequest=new DoMathRequest(3d, 2d,"+");
    MathOperatorImpl mathOperator=new MathOperatorImpl();
    @Test
    public void performAddition_success(){
    assertEquals(5d,mathOperator.doMath(doMathRequest));
    }

}
