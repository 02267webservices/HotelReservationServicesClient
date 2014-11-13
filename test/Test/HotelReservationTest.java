/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import hotelreservationservicesclient.CancellingOfTheHotelFault;
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
     public void bookHotelTest()throws DatatypeConfigurationException{
         
     }
     public void cancelHotelTest()throws DatatypeConfigurationException{
         
     }

    private static void getHotel(java.lang.String city, javax.xml.datatype.XMLGregorianCalendar arrivalDate, javax.xml.datatype.XMLGregorianCalendar departureDate, javax.xml.ws.Holder<hotelreservationservicesclient.HotelType> hotelsNameArray, javax.xml.ws.Holder<java.lang.String> addressOfHotel, javax.xml.ws.Holder<Integer> bookingNr, javax.xml.ws.Holder<Float> priceForWholeStay) {
        hotelreservationservicesclient.HotelReservationService service = new hotelreservationservicesclient.HotelReservationService();
        hotelreservationservicesclient.HotelReservationServices port = service.getHotelReservationServicesBindingPort();
        port.getHotel(city, arrivalDate, departureDate, hotelsNameArray, addressOfHotel, bookingNr, priceForWholeStay);
    }

    private static boolean bookHotel(int bookingNr, hotelreservationservicesclient.CreditcardInformationType creditcardInformation) {
        hotelreservationservicesclient.HotelReservationService service = new hotelreservationservicesclient.HotelReservationService();
        hotelreservationservicesclient.HotelReservationServicesbookHotel port = service.getHotelReservationServicesbookHotelBindingPort();
        return port.bookHotel(bookingNr, creditcardInformation);
    }

    private static String cancelHotel(int bookingNr) throws CancellingOfTheHotelFault {
        hotelreservationservicesclient.HotelReservationService service = new hotelreservationservicesclient.HotelReservationService();
        hotelreservationservicesclient.HotelReservationServicescancelHotel port = service.getHotelReservationServicescancelHotelBindingPort();
        return port.cancelHotel(bookingNr);
    }
}