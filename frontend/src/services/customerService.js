import API from "./api";

export async function getAllCustomers(){

    const response = await fetch(`${API.CUSTOMER}/customer/all`);

    if(!response.ok)
        throw new Error("Unable to fetch customers");

    return await response.json();

}