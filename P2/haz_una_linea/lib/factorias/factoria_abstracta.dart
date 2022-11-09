import 'package:haz_una_linea/piezas/pieza.dart';

abstract class FactoriaAbstracta {
  List<Pieza> piezasPrototipo;

  FactoriaAbstracta(this.piezasPrototipo);

  ///Metodo para crear piezas
  Pieza crearPieza();
}
