package controllers;

import acl.BeverlyAuthAction;
import acl.types.BeverlyHttpAuthObject;
import com.google.inject.Inject;
import play.mvc.Controller;
import play.mvc.With;
import service.InventarioService;

import java.util.HashMap;

@With(BeverlyAuthAction.class)
public class InventarioController extends Controller {

    private InventarioService inventarioService;

    @Inject
    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    private HashMap getAuthorizedResponse(BeverlyHttpAuthObject user, Object data) {
        HashMap response = new HashMap();
        response.put("data", data);
        response.put("user", user.phone);
        return response;
    }

}
