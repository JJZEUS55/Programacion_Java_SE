/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  eduardo.castillo
 * Created: 27/10/2017
 */

CREATE DATABASE Persona;

use Persona;


Create table Persona 
(
  id_persona int primary key auto_increment,
  apellido_materno VARCHAR(200),
  apellido_paterno VARCHAR(200),
  email VARCHAR(200),
  nombre VARCHAR(200),
  telefono VARCHAR(200)
);

