const axios = require("axios");

const serviceTwoApiConfig = axios.create({
  baseURL: "http://localhost:9090",
});

const getLastName = async () => {
  const response = await serviceTwoApiConfig.get("/last_name");
  return response.data.lastName; // adjust key if needed
};

module.exports = { getLastName };
