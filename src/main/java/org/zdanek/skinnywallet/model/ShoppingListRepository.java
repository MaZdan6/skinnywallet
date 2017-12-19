package org.zdanek.skinnywallet.model;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.zdanek.skinnywallet.Person;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(tags = "ShoppingList Entity")
@RepositoryRestResource( path = "shoppingList")
public interface ShoppingListRepository extends PagingAndSortingRepository<ShoppingList, Long> {
	

}
