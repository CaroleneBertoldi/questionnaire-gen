package br.pet.questionario.controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

  public static Result index() {
    return redirect(routes.Questionarios.listar());
  }

}