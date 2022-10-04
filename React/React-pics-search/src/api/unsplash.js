import axios from "axios";

export default axios.create({
    baseURL: 'https://api.unsplash.com',
    headers: {
        Authorization: 
        'Client-ID N2OHM1pOHduCZDrDmj4N6wXo3hicY2ZkSPBc6qK6lMA'
    }
});