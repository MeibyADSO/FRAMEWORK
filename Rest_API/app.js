const express = require('express');
const app = express();
const mongoose= require('mongoose');
const bodyParser = require('body-parser');

app.use(bodyParser.json());
const postRoute = require('./routes/post');
const postRouteLogin = require('./routes/login');

app.use('/servicios' , postRoute);
app.use('/login' , postRouteLogin);


app.get ('/', (rep, rest) => {
rest.send('prueba 1 respuesta del servidor');
});
mongoose.connect('mongodb+srv://DBMeiby:Meiby962006.@cluster0.x6acru3.mongodb.net',
{useNewUrlParser: true } , () =>{
    console.log('Si hay conxión a la BD')
    });
app.listen(10000);


