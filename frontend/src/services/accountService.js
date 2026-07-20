import API from "./api";

export async function getAccounts(){

    const response = await fetch(`${API.ACCOUNT}/account/all`);

    if(!response.ok)
        throw new Error("Unable to fetch accounts");

    return await response.json();

}