package kg.megacom.auction.mappers;

import kg.megacom.auction.model.dto.*;
import kg.megacom.auction.model.entity.*;
public interface ClassMapper {
    Bid bidDtoToBid (BidDto bidDto);
    BidDto bidToBidDto (Bid bid);

    Customer customerDtoToCustomer (CustomerDto customerDto);
    CustomerDto customerToCustomerDto (Customer customer);

    Lot lotDtoToLot (LotDto lotDto);
    LotDto lotToLotDto (Lot lot);

    Status statusDtoToStatus (StatusDto statusDto);
    StatusDto statusToStatusDto (Status status);

    User userDtoToUser (UserDto userDto);
    UserDto userToUserDto (User user);

}
