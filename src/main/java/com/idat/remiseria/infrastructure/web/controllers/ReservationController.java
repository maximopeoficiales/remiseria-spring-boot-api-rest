package com.idat.remiseria.infrastructure.web.controllers;

import com.idat.remiseria.app.use_cases.ReservationService;
import com.idat.remiseria.domain.entitys.Reservation;
import com.idat.remiseria.infrastructure.web.controllers.interfaces.ICrudController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController implements ICrudController<Reservation> {

    @Autowired
    private ReservationService reservationService;


    @GetMapping("/all")
    @ApiOperation("Get all reservations")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Reservation>> getAll() {
        return new ResponseEntity<>(reservationService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation("Search a reservation with a ID")
    @ApiResponses({@ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 404, message = "Reservation not found")})
    public ResponseEntity<Reservation> getById(
            @ApiParam(value = "The id of the reservation", required = true, example = "5")
            @PathVariable("id") int id) {
        return reservationService.findById(id).map(p -> new ResponseEntity<>(p, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    @ApiOperation("Save a reservation")
    @ApiResponse(code = 201, message = "OK")
    public ResponseEntity<Reservation> save(@RequestBody Reservation reservation) {
        return new ResponseEntity<>(reservationService.save(reservation), HttpStatus.CREATED);
    }

    @PutMapping
    @ApiOperation("Update a Reservation")
    @ApiResponse(code = 201, message = "OK")
    public ResponseEntity<Reservation> update(@RequestBody Reservation reservation1) {

        Reservation findReservation = reservationService.findById(reservation1.getIdReservation()).map(reservation -> {
            return reservation;
        }).orElse(null);

        findReservation.setDescription(reservation1.getDescription());
        findReservation.setIdStateReservation(reservation1.getIdStateReservation());
        findReservation.setIdDriver(reservation1.getIdDriver());
        findReservation.setIdPassenger(reservation1.getIdPassenger());
        findReservation.setIdTariff(reservation1.getIdTariff());
        findReservation.setTravelDate(reservation1.getTravelDate());

        return new ResponseEntity<>(reservationService.save(findReservation), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete a Reservation by ID")
    @ApiResponse(code = 201, message = "OK")
    public ResponseEntity<?> delete(
            @ApiParam(value = "The id of the reservation", required = true, example = "1")
            @PathVariable("id") int id) {
        return (reservationService.delete(id)) ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
