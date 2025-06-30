const express = require("express");
const app = express();
const PORT = 8080;

const { getFirstName } = require("./services/serviceOne.controller");
const { getLastName } = require("./services/serviceTwo.controller");

const getFullName = async (req, res) => {
  try {
    const firstName = await getFirstName();
    const lastName = await getLastName();
    const fullName = `${firstName} ${lastName}`;
    res.json({ fullName });
  } catch (err) {
    console.error("Error fetching names:", err.message);
    res.status(500).send("Internal Server Error");
  }
};

app.get("/full_name", getFullName);

app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
