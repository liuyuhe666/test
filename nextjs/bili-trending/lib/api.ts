const API_URL = 'https://60s.viki.moe/bili';

export async function fetchData() {
    const res = await fetch(API_URL, {cache: 'no-store'});
    const json = await res.json();
    if (json.errors) {
        console.log(json.errors);
        throw new Error("Failed to fetch API");
    }
    return json.data;
}