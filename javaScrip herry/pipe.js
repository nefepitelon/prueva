JavaScript

var listaDeCompras = [];

console.log(listaDeCompras.length);

Length = longitud (Cuantos elementos tiene un array)

//metodos de arrays

var colores = ["amarillo", "azul"];
colores.push("rojo");  //Lo agrega al final del array

colores.unshift("verde");  //lo agrega al principio del array

colores.pop();  //Borra el ultimo elemento del array

colores.shift();  //Borra el primer elemento del array

colores.include("azul");  //True


//Metodos avanzados

var nombre = "nicola5";
var palabraSeparada = nombre.split("");
console.log(palabraSeparada);  //"n" "i" "c" "o" "l" "a" "5"
palabraSeparada.pop();
palabraSeparada.push("s");
console.log(palabraSeparada);  //"n" "i" "c" "o" "l" "a" "s"

var palabraArreglada = palabraSeparada.join("");
console.log(palabraArreglada);  //nicolas

//leer todos los elementos de un array

var numeros = [1, 2, 3, 4, 5]
numeros.forEach((num) => console.log(num)); //1, 2, 3, 4, 5
numeros.forEach((num) => console.log(num==2)); //2


//Sumar a todos los elementos de una lista 

var masUno = numeros.map(num => (return num + 1));
console.log(masUno);  //2, 3, 4, 5, 6

//Ciclos en arrays

//Ciclo FOR
var arr = [1, 2, 3, 4, 5];
for (let i = 0; i < arr.length; i++) {
   console.log(arr[i]);
}


//Ciclo WHILE
var arr = [];
while (arr.length < 5) {
   arr.push('Camilo');
}
console.log(arr);


// Objetos

var deportes = {};  //Asi se define un objeto

var deportes = {
  conBalon: ["futbol", "basketball", "tennis"],
  sinBalon: ["boxeo", "surf", "ciclismo"]
};

var persona = {nombre: "nicolas", edad: 18, estudios: [esProgramador: true]};

console.log(persona.edad);  //18
persona.nombre = "felipe";	

console.log(persona.nombre);  //felipe

//CREAR
var autos = {};
autos.marcas = ['Ford', 'Audi', 'Ferrari'];
console.log(autos);  //{marcas = ['Ford', 'Audi', 'Ferrari']}


//BORRAR
delete autos.marcas;
console.log(autos);  //El objeto esta vacio

//Funciones dentro de un objeto

var misFunciones = {
  saludar: function () {
    console.log("Hola");
  },
};
misFunciones.saludar();  //Hola


var atuendos = { manos: ['Guantes', 'Anillos']};
// DOT NOTATION
atuendos.pies = ['Zapatos', 'Soquetes'];
console.log(atuendos);  //{ manos: ['Guantes', 'Anillos'], pies: ['Zapatos', 
'Soquetes']}

// BRACKET NOTATION
atuendos['piernas'] = ['Bermudas', 'Pantalones'];
console.log(atuendos);  //{ manos: ['Guantes', 'Anillos'], pies: ['Zapatos', 
'Soquetes'], piernas: ['Bermudas', 'Pantalones']}


var comidas = {};
var diferenciaDeNotaciones = function (propUno, proDos){
  comidas[propUno] = ["Frutas", "Vegetales"];
  comidas["propDos"] = ["Hamburgesa", "Papas fritas"];
};

diferenciaDeNotaciones("Saludable", "noSaludable");
console.log(comidas);  //{ saludable: ["Frutas", "Vegetales"], propDos: ["Hamburgesa", "Papas fritas"]
  
}


// HAS OWN PROPERTY
var libro = { autor: 'Borges', genero: 'Policial', año: 1990 };
var tienePropiedad = libro.hasOwnProperty('nombre');

console.log(tienePropiedad);


// KEYS
var libro = { autor: 'Borges', genero: 'Policial', año: 1990 };
var todasLasPropiedades = Object.keys(libro);

console.log(todasLasPropiedades);

//For in (Solo se usa en objetos)
for (let prop in mundo) {
   console.log('Esta es la propiedad: ', prop);
   console.log('Este es el valor: ', mundo[prop]);
}


//THIS
var mascota = {
   animal: 'Perro',
   raza: 'Ovejero Alemán',
   amistoso: true,
   dueño: 'María López',
   info: () => {
      console.log('Mi perro es un  ' + this.raza);
   },
};


//Callback

function devuelvoUsuario() {
   return 'Nicolas';
}
function devuelvoSaludo() {
   return 'Hola';
}
function saludar(cb1, cb2) {
   return cb1() + ' ' + cb2();
}
var resultado = saludar(devuelvoSaludo, devuelvoUsuario);
console.log(resultado);  // Hola Nicolas

//otro ejemplo

var devuelvoFrase = function (comida){
  return "hoy quiero comer " + comida;
};

var hablar = function(comida, cb) {
  return cb(comida);
};

var fraseFinal = hablar("Arroz con pollo", devuelvoFrase);
console.log(fraseFinal);  //hoy quiero comer Arroz con pollo