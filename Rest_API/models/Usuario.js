const mongoose = require('mongoose');

const Schema = mongoose.Schema;

const UsuarioShema = Schema({
    nombre: {//nombre del usuario
        type: String,
        require:true
    },
    nick: {
        type: String,
        require:true
    },
    password: {
        type: String,
        require:true
    },
    date: {
        type: Date, //fecha de registro del usuario
        default: Date.now
    }
});
module.exports = mongoose.model('Usuario', UsuarioShema);
