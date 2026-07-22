import API from "./api";

// Get all accounts
export async function getAllAccounts() {

    const response = await fetch(`${API.ACCOUNT}/account/all`);

    if (!response.ok) {
        throw new Error("Unable to fetch accounts");
    }

    return await response.json();
}

// Add account
export async function addAccount(account) {

    const response = await fetch(`${API.ACCOUNT}/account/add`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(account)
    });

    if (!response.ok) {
        const error = await response.text();
        throw new Error(error);
    }

    return await response.json();
}