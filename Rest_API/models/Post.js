const mongoose = require('mongoose');

const Schema = mongoose.Schema;

const PostShema = Schema({
    title: {
        type: String,
        require:true
    },
    description: {
        type: String,
        require:true
    },
    date: {
        type: Date,
        default: Date.now
    }
});
module.exports = mongoose.model('Post', PostShema);
