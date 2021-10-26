package com.idat.remiseria.infrastructure.web.controllers.interfaces;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ICrudController<T> {

    public ResponseEntity<List<T>> getAll();

    public ResponseEntity<T> getById(int id);

    public ResponseEntity<T> save(T entity);

    public ResponseEntity<T> update(T entity);

    public ResponseEntity<?> delete(int id);


}
