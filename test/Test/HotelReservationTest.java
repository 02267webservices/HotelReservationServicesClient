/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import hotelreservationservices.CancelHotelFault;
import hotelreservationservices.HotelsType;
import javax.xml.datatype.DatatypeConfigurationException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author khannoori
 */
public class HotelReservationTest {
     final String HOTEL_URI = "http://10.16.139.202:8080/RestWebService/webresources/hotel";

    
     @Test
     public void getHotelTest()throws DatatypeConfigurationException {
         
         
     }
     @Test
     public void bookHotelTest()throws DatatypeConfigurationException{
         
     }
     @Test
     public void cancelHotelTest()throws DatatypeConfigurationException{
         
     }

    private static boolean bookHotel(int bookingNumber, hotelreservationservices.CreditCardType creditCard) {
        hotelreservationservices.HotelReservationService service = new hotelreservationservices.HotelReservationService();
        hotelreservationservices.HotelReservationServices port = service.getHotelReservationServicesBindingPort();
        return port.bookHotel(bookingNumber, creditCard);
    }

    private static boolean cancelHotel(int bookingNumber) throws CancelHotelFault {
        hotelreservationservices.HotelReservationService service = new hotelreservationservices.HotelReservationService();
        hotelreservationservices.HotelReservationServices port = service.getHotelReservationServicesBindingPort();
        return port.cancelHotel(bookingNumber);
    }

    private static HotelsType getHotels(java.lang.String city, javax.xml.datatype.XMLGregorianCalendar arrival, javax.xml.datatype.XMLGregorianCalendar departure) {
        hotelreservationservices.HotelReservationService service = new hotelreservationservices.HotelReservationService();
        hotelreservationservices.HotelReservationServices port = service.getHotelReservationServicesBindingPort();
        return port.getHotels(city, arrival, departure);
    }

    
   
}