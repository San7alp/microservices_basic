const axios = require("axios");

const serviceOneApiConfig = axios.create({
  baseURL: "http://localhost:7070",
});

const getFirstName = async () => {
  const response = await serviceOneApiConfig.get("/first_name");
  return response.data.firstName; // adjust key if needed
};

module.exports = { getFirstName };
