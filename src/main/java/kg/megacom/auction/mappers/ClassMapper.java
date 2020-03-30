package kg.megacom.auction.mappers;

import kg.megacom.auction.model.dto.*;
import kg.megacom.auction.model.entity.*;
@Mapper
public interface ClassMapper {
ClassMapper INSTANCES=Mappers.getMapper(ClassMapper.class)
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
